#!/bin/bash

for i in $(ls /home/); do
    cp /home/hadley/.bashrc "/home/$i/.bashrc"
done

