#!/bin/bash

for i in $(ls /home/); do
    ln -s "/home/$i/sites" $i
done

