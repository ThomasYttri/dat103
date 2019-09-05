#!/bin/bash

logg = $1
tottid = 0;

echo "Hva er hendelsen?"

read hendelse

while true
do
	grep '$hendelse'$'\t' 'tid' logg
	tottid = $tottid + $tid
	echo "$tottid"
done


