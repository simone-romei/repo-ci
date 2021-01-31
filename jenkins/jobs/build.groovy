
job("commerce - build") {

    parameters {

        booleanParam('FLAG', true)
        choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])

    }

}