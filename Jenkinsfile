
/* Usefull  */


/* External Library */

node('master') {
	echo "test master"

	stage("test") {
		def rootDir = pwd()
		def hybrisBuild = load "${rootDir}@script/jenkins/scripts/build.groovy"
		hybrisBuild.testBuild()

	}

}






