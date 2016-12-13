
/* Usefull  */


/* External Library */

node('master') {
	echo "test master"

	stage("Building Hybris") {
		//Define directory
		def rootDir = pwd()
		
		//Load Script
		def hybrisBuild = load "${rootDir}@script/jenkins/scripts/build.groovy"

		hybrisBuild.unzipPlatform("${rootDir}/opt/hybris/HYBRISCOMM5700P_0.zip","${rootDir}/hybris_57")

	}

}






