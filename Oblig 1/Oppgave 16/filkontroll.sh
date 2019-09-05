#!/bin/bash
cd /home/thomas/hjemmekatalog/skallprogram

file=$1
wtime=$2

if [ -e "$file" ]
then
	exists= true
	changet= stat -c%Y $file
else
	exists= false
fi

while true
do
	if [ -e "$file" ] && [ $exists ]
	then
		if [$changet != stat -c%Y $file]
		then
			echo "$file har blitt endret."
		fi
	fi

	if [ -e "$file" ] && [ !$exists ]
	then
		echo "$file har blitt opprettet"
	fi

	if [ ! -e "$file" ] && [ $exists ]
	then
		echo "$file har blitt slettet"
	fi

	if [ ! -e "$file" ] && [ !$exists ]
	then
		echo "$file eksisterer ikkje."
	fi

sleep $wtime
done
