

def unzipPlatform(hybrisZip, destFolder) {
	echo "unzipping ${hybrisZip} to ${destFolder}"
	unzip hybrisZip -d destFolder
}
return this