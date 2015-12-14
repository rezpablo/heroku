#!/bin/bash

echo "========================================================"
echo "install addon ...."
heroku addons | grep POSTGRES

echo "========================================================"
echo "create dabase in hobby-dev plan"
heroku addons:create heroku-postgresql:hobby-dev

heroku pg:info

