job('commerce-suite') {
    description('Job for peparing a commerce workspace')
    parameters {
        fileParam('commerce-suite/hybris-commerce-suite.zip', 'SAP Commerce Suite')
    }
    steps {
        sh("unzip -q commerce-suite/hybris-commerce-suite.zip -d commerce-suite")
    }
}