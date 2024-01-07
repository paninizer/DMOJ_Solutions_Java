#[macro_use] extern crate dmoj;
use std::collections::{HashSet, VecDeque};

#[derive(Clone)]
struct Grid {
    g: Vec<Vec<u16>>,
    id: String,
}

impl Grid {
    fn new(grid: Vec<Vec<u16>>) -> Self {
        let mut grid = Grid {
            g: grid,
            id: String::new(),
        };
        grid.update_id();
        grid
    }

    fn translate_col(&mut self, d: Direction, c: usize) {
        let mut change = true;
        
        match d {
            Direction::UP => {
                while change {
                    change = false;
                    for r in 0..4 - 1 {
                        if self.g[r][c] == 0 && self.g[r + 1][c] != 0 {
                            self.g[r][c] = self.g[r + 1][c];
                            self.g[r + 1][c] = 0;
                            change = true;
                        }
                    }
                }
            },
            Direction::DOWN => {
                while change {
                    change = false;
                    for r in (1..4).rev() {
                        if self.g[r][c] == 0 && self.g[r - 1][c] != 0 {
                            self.g[r][c] = self.g[r - 1][c];
                            self.g[r - 1][c] = 0;
                            change = true;
                        }
                    }
                }
            },
            _ => ()
        }
    }

    fn translate_row(&mut self, d: Direction, r: usize) {
        let mut change = true;
        
        match d {
            Direction::RIGHT => {
                while change {
                    change = false;
                    for c in (1..4).rev() {
                        if self.g[r][c] == 0 && self.g[r][c - 1] != 0 {
                            self.g[r][c] = self.g[r][c - 1];
                            self.g[r][c - 1] = 0;
                            change = true;
                        }
                    }
                }
            },
            Direction::LEFT => {
                while change {
                    change = false;
                    for c in 0..4 - 1 {
                        if self.g[r][c] == 0 && self.g[r][c + 1] != 0 {
                            self.g[r][c] = self.g[r][c + 1];
                            self.g[r][c + 1] = 0;
                            change = true;
                        }
                    }
                }
            },
            _ => ()
        }
    }

    fn translate(&mut self, d: Direction) {

        match d {
            Direction::UP | Direction::DOWN => {
                for c in 0..4 {
                    self.translate_col(d.clone(), c);
                }
            },
            Direction::RIGHT | Direction::LEFT => {
                for r in 0..4 {
                    self.translate_row(d.clone(), r);
                }
            }
        }
    }

    fn shift(&mut self, d: Direction) {

        match d {
            Direction::UP => {
                self.translate(Direction::UP);
                for r in 1..4 {
                    for c in 0..4 {
                        if self.g[r - 1][c] == self.g[r][c] {
                            self.g[r - 1][c] += self.g[r][c];
                            self.g[r][c] = 0;
                        }
                    }
                }
                self.translate(Direction::UP);
            },
            Direction::DOWN => {
                self.translate(Direction::DOWN);
                for r in (1..4).rev() {
                    for c in 0..4 {
                        if self.g[r][c] == self.g[r - 1][c] {
                            self.g[r][c] += self.g[r - 1][c];
                            self.g[r - 1][c] = 0;
                        }
                    }
                }
                self.translate(Direction::DOWN);
            },
            Direction::LEFT => {
                self.translate(Direction::LEFT);
                for c in (1..4).rev() {
                    for r in 0..4 {
                        if self.g[r][c - 1] == self.g[r][c] {
                            self.g[r][c - 1] += self.g[r][c];
                            self.g[r][c] = 0;
                        }
                    }
                }
                self.translate(Direction::LEFT);
            },
            Direction::RIGHT => {
                self.translate(Direction::RIGHT);
                for c in 0..4 - 1 {
                    for r in 0..4 {
                        if self.g[r][c + 1] == self.g[r][c] {
                            self.g[r][c + 1] += self.g[r][c];
                            self.g[r][c] = 0;
                        }
                    }
                }
                self.translate(Direction::RIGHT);
            }
        }
        self.update_id();
    }

    fn update_id(&mut self) {
        self.id = String::new();
        for r in 0..4 {
            for c in 0..4 {
                self.id += &self.g[r][c].to_string();
            }
        }
    }

    fn get_max(&self) -> u16 {
        let mut m = 0;
        for r in 0..4 {
            for c in 0..4 {
                m = m.max(self.g[r][c]);
            }
        }
        m
    }
}

#[derive(Clone)]
enum Direction {
    UP,
    RIGHT,
    DOWN,
    LEFT,
}

impl TryFrom<u16> for Direction {
    type Error = ();
 
    fn try_from(value: u16) -> Result<Self, Self::Error> {
        match value {
            0 => Ok(Direction::UP),
            1 => Ok(Direction::DOWN),
            2 => Ok(Direction::LEFT),
            3 => Ok(Direction::RIGHT),
            _ => Err(())
        }
    }
}

fn main() {
    for _ in 0..5 {
        let mut arr = Vec::new();
        for _ in 0..4 {
            let mut temp = vec![0, 0, 0, 0];
            for i in 0..4 {
                temp[i] = scan!(u16);
            }
            arr.push(temp);
        }
        let init = Grid::new(arr);
        let mut best = init.get_max();
        let mut used = HashSet::new();
        let mut q = VecDeque::new();
        q.push_back(init);

        while !q.is_empty() && best != 2048 {
            let current = q.pop_front().unwrap();
            used.insert(current.id.clone());
            for d in 0..4 {
                let mut temp = current.clone();
                temp.shift(Direction::try_from(d).unwrap());
                if !used.contains(&temp.id) {
                    q.push_back(temp.clone());
                    used.insert(temp.id.to_string());
                    best = best.max(temp.get_max());
                }
            }
        }
        dmoj::println!("{}", best);
    }
}
