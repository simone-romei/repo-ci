# Initial Setup

## Jenkins First Boot

- Build the container
```
docker-compose -f "env/docker-compose.yml" up -d --build
```

- Check container log
```
docker logs --tail 1000 jenkins-commerce
```

- Check initial password
```
Jenkins initial setup is required. An admin user has been created and a password generated.
Please use the following password to proceed to installation:

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

This may also be found at: /var/jenkins_home/secrets/initialAdminPassword
```

- Connect Jenkins
```
http://localhost:8123/
```

- Login and install all the suggested plugin.
- Install the following "extra" plugin - `your_jenkins_url/pluginManager/available`
```
Git
Job DSL
Pipeline: Job
Pipeline: Groovy 
```
