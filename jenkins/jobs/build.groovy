
job("commerce - build") {

    parameters {

        gitParam('commerce_git') {
            
            branch('commerce_git_branch')
        
            defaultValue('default')
        
            description('Commerce Repository')
            // Specifies the sort order for tags.
            //sortMode(String sortMode)
            // Specifies a filter for tags.
            //tagFilter(String tagFilter)
            // Specifies the type of selectable values.
            //type(String type)
        }

    }

}