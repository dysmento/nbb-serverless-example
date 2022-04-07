## nbb + AWS Function URLs

1. clone this
2. `npm install`
3. `sls deploy`

Assumes you have AWS credentials and permission to create a CloudFormation stack and all the resources that it uses: S3 bucket for deploys, IAM role for Lambda execution, log group, and the Lambda function itself.

After deploy, you'll be given the HTTP endpoint to use. This is a Hello, World, so it's not doing much:


```
http https://your-very-own-endpoint-here.lambda-url.us-east-2.on.aws/ name=Todd

HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Date: Thu, 07 Apr 2022 18:11:30 GMT
X-Amzn-Trace-Id: root=1-624f2952-256c974c58fadb721b91c251;sampled=0
x-amzn-RequestId: 2553ad72-ef8c-4e18-9d6b-5223895dbb3e

{
    "result": "Hello, Todd"
}
```
