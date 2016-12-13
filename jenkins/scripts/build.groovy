

def unzipPlatform(hybrisZip, destFolder) {
	echo "unzipping ${hybrisZip} to ${destFolder}"
	sh "mkdir ${destFolder}"
	sh "unzip ${hybrisZip} -d ${destFolder}"
}
return this