mkdir lab0
cd lab0
touch cubchoo ferrothorn panpour
mkdir feebas metang sunflora
cd feebas
touch furret dewott
mkdir shellder swinub
cd ../metang
touch larvesta whismur whiscash
mkdir xatu magmar wooper
cd ../sunflora
touch gothita arbok teddiursa
mkdir arcanine vileplume quagsire
cd ..
cat >> cubchoo << EOF
Живет = Cave Taiga Tundra
EOF
cat >> feebas/furret << EOF
Живет = Forest Grassland
EOF
cat >> feebas/dewott << EOF
Тип диеты = Herbivore
EOF
cat >> ferrothorn << EOF
Ходы =Endeavor Giga Drain Gravity Iron
Defence Iron Head Knock Off Magnet Rise
Rock Climb Seed Bomb Sleep Talk Snore
Stealth Rock Worry Seed
EOF
cat >> metang/larvesta << EOF
Способности = Swarm Blaze Flame Body
EOF
cat >> metang/whismur << EOF
Ходы = Body Slam Counter Defense Curl
Double-Edge Dynamicpunch Fire Punch
Hyper Voice Ice Punch Icy Wind Mega Kick
Mega Punch Mud-Slap Psych Up Rollout
Seismic Toss Shock Wave Sleep Talk Snore
Thunderpunch Uproar Water Pulse Zen
Headbutt
EOF
cat >> metang/whiscash << EOF
Развитые способности = Hydration
EOF
cat >> panpour << EOF
weigth=29.8 height=24.0 atk=5 def=5
EOF
cat >> sunflora/gothita << EOF
Тип диеты = Herbivore
EOF
cat >> sunflora/arbok << EOF
Развитые способности = Unnerve
EOF
cat >> sunflora/teddiursa << EOF
Способности = Last Chance Pickup Quick
Feet
EOF