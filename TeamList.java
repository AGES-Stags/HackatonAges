public class TeamList {
  private Node head;
  private Node tail;
  private int size;

  /*
   * TeamList Constructor;
   */
  private TeamList(){
    head = tail = null;
    size = 0;
  }

  /*
   * Class Node;
   */
  private class Node{
    Team team;
    Node next;
    Node previous;

    public Node(Team team){
      this.team = team;
    }
  }

  /*
  * Method add a new Team;
  */
  public void add(Team team){
    Node nodeTeam = new Node();
    if(head == null){
      head = tail = nodeTeam;
      size++;
      return;
    }
    tail.next = nodeTeam;
    nodeTeam.previous = tail;
    tail = nodeTeam;
    size++;
  }

  /*
  ****CONFIRMAR SE ESTA CORRETA***
  * Method remove an registered team;
  */
  public void removeTeam(Team team){
    Node auxiliarNode;
    if(head != null){
      auxiliarNode = head;
      if(auxiliarNode.team.equals(team)){
        auxiliarNode.next.previous = auxiliarNode.previous;
        auxiliarNode.previous.next = auxiliarNode.next;
        size--;
      }
    }
  }

  /*
   * Removes the first occurrence of the specified element from this list, if it is present.
   */
  public void removeDataTeam(Team data){
  }

  /*
   * Returns true if this list contains the specified element.
   */
  public boolean contains(Team team){
    boolean response = false;
    Node auxiliarNode;
    if(head != null){
      auxiliarNode = head;
      if(team == auxiliarNode.teamName){
        response = true;
      }
      auxiliarNode = auxiliarNode.next;
    }
    return response;
  }
  
  /*
  * Obtains data from registered team;
  */
  public Team get(Team team){
    Node auxiliarNode;
    if(head != null){
      auxiliarNode = head;
      while(auxiliarNode != team){
        auxiliarNode = auxiliarNode.next;
      }
    }
    return auxiliarNode;
  }

  /*
   * Returns the element at the specified position in this list.
   */
  public Team getByIndex(int index){
    Node auxiliarNode;
    if(head != null){
      auxiliarNode = head;
      for(int i=0; i<index; i++){
        if(i != index){
          auxiliarNode = auxiliarNode.next;
        }else
          return auxiliarNode.team;
      }
    }
  }

  /*
   * Returns the number of elements in this list.
   */
  public int size(){

    return size;
  }

  /*
   * Returns the number of elements in this list.
   */
  public Team[] toArray(){
    Team[] array = new Team[size];
    Node node = head;

    for(int i=0; i<size; i++){
      array[i] = node.team;
      node = node.next;
    }
    return array;
  }
}
