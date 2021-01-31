
job("commerce - build") {

    parameters {

        gitParam("commerce_git") {
            branch("commerce_git_branch")
        }

    }

}