// I you are behind the proxy of your orgianization, uncomment the following lines to set proxy config
//System.setProperty("proxySet", "true");
//System.setProperty("proxyHost", yourProxyIpAddress);
//System.setProperty("proxyPort", yourProxyPortNumber);

new File("Keywords/helloWorld.groovy") << new URL(
	"https://gist.githubusercontent.com/kazurayam/a80a93e4376eae3164adb8e021b78385/raw/f3cc41c07fec95a8840f716ffb931337154c7010/hellowWorld.groovy"
	).openStream()