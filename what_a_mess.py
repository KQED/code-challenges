some_do_dad = ["green", "red", "baz"]
some_odd_thing = ["one", "two", "baz"]
some_other_thing = { "type": "123abc" }

def strange_func():
  output = (
    "hello" if "foo" in some_do_dad
    else ("world" if "bar" in some_do_dad
      else ("alice" if "baz" in some_do_dad
        else ("bob" if some_other_thing["type"] == "123abc"
          else ("carol" if (
            "foo" in some_odd_thing or "baz" in some_odd_thing or "bar" in some_odd_thing)
            else "This isn't working")))))
  print output

strange_func()

# What will this funciton output?
# Technically, it works...but what's wrong with it?
# Can you rewrite this without ternaries?
