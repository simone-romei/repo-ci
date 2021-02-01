
job('commerce-build') {
    description('build commerce platform')
    jdk('Java 11')
    cloneWorkspace('commerce-workspace', 'Any')
}