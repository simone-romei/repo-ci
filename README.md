# Environment Setup

## Build & Run the Environment
```
docker-compose -f "env/docker-compose.yml" up -d --build
```

## Configure Jenking

### Setup Admin Account
This will setup the admin account for Jenkins (first boot)

- Check container log
```
docker logs --tail 1000 jenkins-commerce
```

- Check generated password
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

### Install Extra Plugin
Some extra plugin must be installed at Jenkins level.

- Connect to Jenkins plugin manager
```
http://localhost:8123/pluginManager/
```

- Install the following available plugin:
```
Job DSL
?clone-workspace-scm
envinject
```

### Configure Shared Library
- How to setup a shared library
```
https://www.jenkins.io/doc/book/pipeline/shared-libraries/
```
- Use as library name:
```
commerce-library
```
