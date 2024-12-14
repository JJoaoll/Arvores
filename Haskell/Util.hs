module Util where 

import Prelude  

pairing :: (c -> a) -> (c -> b) -> (c -> (a,b))
pairing f g x = (f x, g x)


cross :: (a -> c) -> (b -> d) -> ((a,b) -> (c,d))
cross f g = pairing (f . fst) (g . snd)


delta :: a -> (a, a)
delta x = (x, x)