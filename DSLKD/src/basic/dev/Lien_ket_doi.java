package basic.dev;

public class Lien_ket_doi {
	Node head;
    Node tail;
    lien_ket_doi(){
        head = tail = null;
    }

   lien_ket_doi(Node node){
        Add(node);
    }

   public void Add(Node node) {
       if (head == null) {
          head = tail = node;     
       }else {
         tail.next = node;
         node.prev = tail;
         tail = node;
      } 
   }

   public Node Find(int Data) {
        Node now = head;
        while (now != null) {
            if (now.Data == Data) return now;
            now = now.next;
        };
        return null;
   }

   public Node Find(Node node) {
        return this.Find(node.Data);
   }

    public void AddFirst(Node node) {
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void AddFirst(int Data) {
        Node node = new Node(Data);
        this.AddFirst(node);
    }

    public void AddFirstk(int k, int Data) {
        Node node = new Node(Data);
        this.AddFirstk(k, node);
    }

    public void AddFirstk(int k, Node node) {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        };
        if (head.Data == k) {
            this.AddFirst(node);
            return;
        }
        Node nodek = this.Find(k);
        if (nodek == null) {
            System.out.println("Không tìm thấy khoá k");
            return;
        }
       nodek.prev.next = node;
       node.prev = nodek.prev;
       node.next = nodek;
       nodek.prev = node; 
    }

    public void AddAfterk(int k, int Data) {
        Node node = new Node(Data);
        this.AddAfterk(k, node);
    }

    public void AddAfterk(int k, Node node) {
        Node nodek = this.Find(k);
        if (nodek == null) {
            System.out.println("Không tìm thấy khoá k");
            return;
        }
        if (nodek.next == null) {
            this.Add(node);
            return;
        }
        node.next = nodek.next;
        nodek.next.prev = node;
   nodek.next = node;
       node.prev = nodek;
       if (node.next != null) tail = node; 
    }

    public void Deletek(int k) {
        Node node = new Node(k);
        this.Deletek(node);
    }
    public void Deletek_New(Node k) {
       Node node = this.Find(k);
       if (node == null) return;
       node = node.next; 
   }

   public void Deletek(Node k) {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        };
        if (head.Data == k.Data) {
            this.DeleteFirst();
            return;
        }
        Node nodek = this.Find(k);
        if (nodek == null) {
            System.out.println("Không tìm thấy khoá k");
            return;
        }
       if (nodek.next == null) {
           this.DeleteAfter();
           return;
       }
       nodek.prev.next = nodek.next;
       nodek.next.prev = nodek.prev;   
  }

  public void DeleteFirst() {
        if (head == null) return;
        head = head.next;
        if (head == null) tail = null;
    }

   public void DeleteFirstk(int k) {
        Node node = new Node(k);
        this.DeleteFirstk(node);
    }

   public void DeleteFirstk(Node node) {
        if (head == null) return;
        if (head.Data == node.Data) return;
        if (head.next.Data == node.Data) {
            this.DeleteFirst();
            return;
        }
        Node nodek = this.Find(node);
        nodek.prev.prev.next = nodek;
       nodek.prev = nodek.prev.prev; 
   }

   public void DeleteAfter() {
        if (head == null) return;
        if (head.next == null) {
            this.DeleteFirst();
            return;
        }
        tail.prev.next = null;
        tail = tail.prev; 
  }

public void Delete() {
        head = tail = null;
    }
public void DeleteAfterk(Node node) {
       Node k = this.Find(node);
       if (k == null) {
           System.out.println("Không tìm thấy khoá k");
           return;
       }
      if (k.next == null) {
           System.out.println("k không có phần tử phía sau.");
           return;
     }
     if (k.next.next == null) {
           this.DeleteAfter();
           return;
      }
     k.next = k.next.next;
     k.next.prev = k; 
 }
 public void Add(int Data) {
     Node node = new Node(Data);
     this.Add(node); 
  } 

 public void Print() {
      if (head == null) { 
       System.out.println("Danh sách liên kết rỗng, không thể in");
        return;
       }
      System.out.println("Danh sách liên kết : ");
      Node now = head;
      while (now != null) {
        now.Print();
        now = now.next;
       }
 }
}

class Node{
    int Data = 0;
    Node next = null;
    Node prev = null;
    Node(){ 
    } 
    Node(int Data){
       this.Data = Data;
     }

    public void Print() {
      System.out.println("\t- Data : " + this.Data); 
    }
}
