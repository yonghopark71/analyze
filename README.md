# analyze


Execute :
        curl --header "Content-Type: application/json" expectedResult
             --request POST 
             --data '{"text":"hello 2 times  "}' 
             https://isnez86hj6.execute-api.us-east-2.amazonaws.com/analyze/analysis


expectedResult :
        {
            "textLength":{"withSpaces":15,"withoutSpaces":11},
            "wordCount":3,
            "characterCount":[{"e":2},{"h":1},{"i":1},{"l":2},{"m":1},{"o":1},{"s":1},{"t":1}]
        }

