from flask import Flask, request, jsonify

userApp = Flask(__name__)

users = {}

@userApp.route('/users', methods=['GET', 'POST'])
def usersFunction():
  global users
  if request.method == 'GET': return jsonify(users)
  elif request.method == 'POST':
    name = request.json['name']
    todo1 = request.json['todo1']
    todo2 = request.json['todo2']
    users[name] = [todo1, todo2]
    return jsonify({"Record added" : True})

if __name__ == "main":
  print("User service started..")
  userApp.run(debug=True, port=5000)