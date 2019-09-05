#!/bin/bash
mittArray=("$@")
cd/home/hjemmekatalog/skallprogrammer
for i in"${mittArray[@]}"
do
	./filkontroll.sh @i 5 &
done
