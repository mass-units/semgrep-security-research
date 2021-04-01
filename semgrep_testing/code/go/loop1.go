package main

import "log"

func main() {
  doneFirst := false
  for i := 0; i < 10; i++ {
    log.Print(i)

    for j := 0; j < 100; j++ {
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

    doneFirst = true
  }
}