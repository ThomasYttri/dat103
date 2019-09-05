#!/bin/bash
echo "Tast inn tall du vil summere, trykk ctrl+d for å få sum."

declare -i sum = 0

while read num
do
	sum+=$num
done

echo "Summer er: $sum"
