/* groovylint-disable CompileStatic */
pipelineJob('commerce pipeline - build fast') {
    description('Pipelina job for build fast commerce suite')
    definition {
        cps {
            script('''
                @Library('commerce-library@master') _
                pipeline {
                    agent any
                    stages {
                        stage('setup') {
                            steps {
                                commerceSetup()
                            }
                        }
                        stage('build') {
                            steps {
                                commerceAnt('clean all')
                            }
                        }
                    }
                }
        '''.stripIndent())
        sandbox()
        }
    }
}
