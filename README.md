## nbb + AWS Function URLs
This is probably the quickest and most painless way there's ever been to put Clojure code on the web.

It combines three nice things:
1. nbb, aka babashka for Node.js: https://github.com/babashka/nbb
2. serverless framework: https://www.serverless.com/
3. AWS Function URLs: https://aws.amazon.com/blogs/aws/announcing-aws-lambda-function-urls-built-in-https-endpoints-for-single-function-microservices/

## Meaning What?
Meaning you can have your ClojureScript code live on the web without jumping through the usual hoops of setting up a build system, compiling, configuring an API Gateway.

## How-To
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
