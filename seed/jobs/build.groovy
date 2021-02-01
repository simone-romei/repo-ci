
job('commerce-build') {
    description('build commerce platform')
    parameters {
        fileParam('hybris-commerce-suite.zip', 'SAP Commerce Suite')
    }
    environmentVariables {
        env('commerce_zip', 'hybris-commerce-suite.zip')
    }
    steps {
        dsl {
            external('/vars/commerceSetup.groovy')
        }
        shell("echo 'commerce-build: started'")
        shell("echo 'commerce-build: setup commerce'")
    }
}