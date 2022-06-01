#!/bin/sh

shopt -s expand_aliases
podName='my-nginx'
imageName='nginx:alpine'

k run $podName --image=$imageName