@Library('commerce-library') _

job('commerce-build') {
    description('build commerce platform')
    jdk('Java 11')
    parameters {
        fileParam('commerce-suite/hybris-commerce-suite.zip', 'SAP Commerce Suite to be used')
    }
    steps {
        log.info 'preparing commerce worspace'
    }
}