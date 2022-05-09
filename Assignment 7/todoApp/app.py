from flask import Flask, request, jsonify
import requests
todoApp = Flask(__name__)

@todoApp.route('/todos', methods=['GET'])
def todoFunction():
  r = requests.get('http://localhost:5001/users')
  name = request.args.get('name')
  return jsonify(r.json()[name])

if __name__ == "main":
  print("Todo service started..")
  todoApp.run(debug=True, port=5001)