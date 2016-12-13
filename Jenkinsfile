
/*  ON JENKIS MACHINE */



/* External Library */

node('master') {
	echo "test master"

	stage("Building Hybris") {
		//Define directory
		def workspace = pwd()
		
		//Load Script
		def hybrisBuild = load "${workspace}@script/jenkins/scripts/build.groovy"

		hybrisBuild.unzipPlatform("/opt/hybris/HYBRISCOMM5700P_0.zip","${workspace}/hybris_57")

	}

}






