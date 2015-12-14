# Provisioning the add-on
heroku addons | grep POSTGRES

#Create a new database
heroku addons:create heroku-postgresql:hobby-dev
heroku addons:create heroku-postgresql:hobby-basic

#track their status
heroku pg:wait

# get config
heroku config -s | grep HEROKU_POSTGRESQL

#info
heroku pg:info

#logs
heroku logs -t
heroku logs -p postgres -t
heroku pg:diagnose --app yukApName

# Open PSQL
heroku pg:psql

#Reset
heroku pg:reset DATABASE