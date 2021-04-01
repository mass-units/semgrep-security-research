package main

import "log"

func inner(i, j int) {
  c := i * j

  going := true
  k := 0
  for going {
    if k == c {
      break
    }

    k++
    log.Print(k)
  }
}

func main() {
  doneFirst := false
  for i := 0; i < 10; i++ {
    log.Print(i)

    for j := 0; j < 100; j++ {
      inner(i, j)
    }

    doneFirst = true
  }
}