
job('commerce-build') {
    description('build commerce platform')
    jdk('Java 11')
    scm {
        cloneWorkspace('commerce-workspace', 'Any')
    }
}