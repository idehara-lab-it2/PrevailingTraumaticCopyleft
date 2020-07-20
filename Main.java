import requests

response = requests.get('http://weather.livedoor.com/forecast/webservice/json/v1?city=471020')

data = response.json()

print( data['description']['text'] )

forecasts = data['forecasts']
for d in forecasts:
    print(d['date'])
    print(d['telop'])
    print(d['temperature']['max'])
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}