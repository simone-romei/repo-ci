job('commerce-suite') {
    description('Job for peparing a commerce workspace')
    parameters {
        fileParam('hybris-commerce-suite.zip', 'SAP Commerce Suite')
    }
    steps {
        shell("unzip -q hybris-commerce-suite.zip -d commerce-suite")
    }
}