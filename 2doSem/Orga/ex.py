import http.client, urllib.request, urllib.parse, urllib.error, base64

headers = {
    # Request headers
    'Content-Type': 'application/json',
    'Ocp-Apim-Subscription-Key': '430f8928c89f483c882e71a3376208ba',
}

params = urllib.parse.urlencode({
    # Request parameters
    'returnFaceId': 'true',
    'returnFaceLandmarks': 'false',
    'returnFaceAttributes': 'emotion',
})

a = 'https://lh4.googleusercontent.com/ToPyPBApCU9qAThWnzM-3Vlpds893Z7keN2RyO0FVAtjVhm4c5lCjFIAXsDYzn_qSEphQlZulHuqSEFJD6Fj=w1919-h809'
try:
    conn = http.client.HTTPSConnection('westcentralus.api.cognitive.microsoft.com')
    conn.request("POST", "/face/v1.0/detect?%s" % params, "{'url': '" + a + "'}", headers)
    response = conn.getresponse()
    data = response.read()
    print(data)
    file = open("testfile.txt","w") 
    file.write(data.decode("utf-8"))
	#file.write("Hello World") 
	#file.write("This is our new text file") 
	#file.write("and this is another line.") 
	#file.write("Why? Because we can.") 
    file.close()
    conn.close()
except Exception as e:
    print("[Errno {0}] {1}".format(e.errno, e.strerror))