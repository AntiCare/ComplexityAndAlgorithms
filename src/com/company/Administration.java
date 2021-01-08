package com.company;

import com.company.Maze.Maze;
import com.company.Module.Dot;
import com.company.Module.State;

import java.util.*;

public class Administration {
    private Maze maze;
    private Dot pawn1, pawn2;
    private State state;
    private  ArrayList<Dot> dots;
    private Set<State> visited = new HashSet<>();

    public Administration() {
        maze = new Maze();
        pawn1 = maze.getDots().get(0);
        pawn2 = maze.getDots().get(1);
        state = new State(pawn1,pawn2);
        System.out.println(state);

        List<State> solution  = dfs(state,visited);

        System.out.println(solution);
    }

    LinkedList<State> dfs(State start, Set<State> visited) {
        LinkedList<State> solution;
        visited.add(start);
        if (isGoalState(start)) { /* Found */
            solution = new LinkedList<State>();
            solution.add(start);
            return solution;
        } else {
            List<State> neighbours = start.getNeighbours(start);
            for(State neighbour : neighbours){
                if (!visited.contains(neighbour)) {
                    solution = dfs(neighbour, visited);
                    if (goalIsReached(solution)) {
                        solution.addFirst(start);
                        return solution;
                    }
                }
            }
        }
        /* visited.remove(start); */
        return new LinkedList<State>(); /* No solution */
    }



    private boolean goalIsReached(LinkedList<State> solution) {
        for (State e: solution) {
            if((e.getPawn1Num()==999|| e.getPawn2Num()==999) && solution.contains(e)){
                return  true ;
            }
        }
        return false;
    }


    private boolean isGoalState(State start) {
        if (start.getPawn1Num()==999 || start.getPawn2Num()==999){
            return true ;
        }
        return false;
    }



}
