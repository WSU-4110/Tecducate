import pyodbc
from flask import Flask, request, render_template

app = Flask(__name__)

# Database connection parameters
server = 'DESKTOP-IO4EJHI'
database = 'Tecducate'
username = 'saa'
password = '12345678'

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        fullname = request.form['fullname']
        email = request.form['email']
        number = request.form['number']
        password = request.form['password-input']

        # Establish a database connection
        connection = pyodbc.connect(f'DRIVER={{ODBC Driver 17 for SQL Server}};SERVER={server};DATABASE={database};UID={username};PWD={password}')

        cursor = connection.cursor()

        # Insert data into the database
        cursor.execute("INSERT INTO SignUp (fullname, email, number, password) VALUES (?, ?, ?, ?)", (fullname, email, number, password))
        connection.commit()

        connection.close()

        return "Data inserted successfully."

    return render_template("SignUp.html")

if __name__ == '__main__':
    app.run()
