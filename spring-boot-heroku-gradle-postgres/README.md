# Provisioning the add-on
``` shelscript
$ heroku addons | grep POSTGRES
```

#Create a new database
``` shelscript
$ heroku addons:create heroku-postgresql:hobby-dev
$ heroku addons:create heroku-postgresql:hobby-basic
```

#track their status
``` shelscript
$ heroku pg:wait
```

# get config
``` shelscript
$ heroku config -s | grep HEROKU_POSTGRESQL
``` 

#info
``` shelscript
$ heroku pg:info
```

#logs
``` shelscript
$ heroku logs -t
$ heroku logs -p postgres -t
$ heroku pg:diagnose --app yukApName
```

# Open PSQL
``` shelscript
$ heroku pg:psql
```

#Reset
``` shelscript
$ heroku pg:reset DATABASE
```

#Remote conex
```shelscript
ssl=true
sslfactory=org.postgresql.ssl.NonValidatingFactory
```
