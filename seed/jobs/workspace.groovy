
job('commerce-workspace') {
    description('prepare the workspace for commerce')
    parameters {
        fileParam('commerce-suite/hybris-commerce-suite-2005.0.zip', 'SAP Commerce Suite to be used')
    }
}