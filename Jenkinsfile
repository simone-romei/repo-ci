
/* Usefull  */


/* External Library */

node('master') {
	echo "test master"

	stage("Building Hybris") {
		//Define directory
		def workspace = pwd()
		
		//Load Script
		def hybrisBuild = load "${workspace}@script/jenkins/scripts/build.groovy"

		hybrisBuild.unzipPlatform("${workspace}/opt/hybris/HYBRISCOMM5700P_0.zip","${rootDir}/hybris_57")

	}

}






