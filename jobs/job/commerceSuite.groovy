job('commerce-suite') {
    description('Job for peparing a commerce workspace')
    parameters {
        fileParam('commerce-suite/hybris-commerce-suite.zip', 'SAP Commerce Suite')
    }
    steps {
        unzip zipFile: 'commerce-suite/hybris-commerce-suite.zip', dir: 'commerce-suite', quite: true
    }
}