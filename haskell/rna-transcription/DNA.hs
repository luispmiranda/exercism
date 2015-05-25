module DNA (toRNA) where

charToRNA :: Char -> Char
charToRNA n
    | n == 'C' = 'G'
    | n == 'G' = 'C'
    | n == 'A' = 'U'
    | n == 'T' = 'A'
    | otherwise = n

toRNA :: [Char] -> [Char]
toRNA [] = []
toRNA (h:t) = [charToRNA(h)] ++ toRNA t