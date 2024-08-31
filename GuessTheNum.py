# guess the number game
import random

print("Welcome, choose the level:\n1-EASY\n2-MEDIUM\n3-HARD")
x = int(input(">>"))

if x == 1:
  print("Guess any number between 1-10.")
  ran_num = random.randint(1, 10)
  flag = True
  attempts = 0

  while flag:
    y = int(input(">"))
    attempts += 1
    if ran_num == y:
      print("Congratulations, you have guessed the right answer!")
      if attempts == 1:
        print("Perfect, You have an excellent guess!")
      elif attempts <= 5:
        print("Nice guess!")
      else:
        print("Poor guess!")
      flag = False
    elif ran_num > y:
      print("Guess higher!")
    elif ran_num < y:
      print("Guess lower!")

elif x == 2:
  print("Guess any number between any number between 1-25.")
  ran_num = random.randint(1, 25)
  flag = True
  attempts = 0

  while flag:
    y = int(input(">"))
    if ran_num == y:
      print("Congratulations, you have guessed the right answer!")

      if attempts == 1:
        print("Perfect, You have an excellent guess!")
      elif attempts <= 5:
        print("Nice guess!")
      else:
        print("Poor guess!")

      flag = False
    elif ran_num > y:
      print("Guess higher!")
    elif ran_num < y:
      print("Guess lower!")

elif x == 3:
  print("Guess any number between any number between 1-50.")
  ran_num = random.randint(1, 50)
  flag = True
  attempts = 0

  while flag:
    y = int(input(">"))
    if ran_num == y:
      print("Congratulations, you have guessed the right answer!")

      if attempts == 1:
        print("Perfect, You have an excellent guess!")
      elif attempts <= 5:
        print("Nice guess!")
      else:
        print("Poor guess!")

      flag = False
    elif ran_num > y:
      print("Guess higher!")
    elif ran_num < y:
      print("Guess lower!")

else:
  print("Invalid option!")
