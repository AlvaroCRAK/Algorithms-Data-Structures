#include <iostream>
#include <vector>
using namespace std;

struct Node {
  vector<Node*> children;
  char value;
  Node ( char val ) : value(val) {}
};

void addChild ( Node* parent, char value ) {
  Node* child = new Node(value);
  parent->children.push_back(child);
}

void pre_orden ( Node* node ) {
  //if ( node == nullptr ) 
    //return;
  cout << node->value << ", ";
  for ( int i = 0; i < node->children.size(); i++ ) 
    pre_orden ( node->children[i] );
}

void post_orden ( Node* node ) {
  //if ( node == nullptr ) 
    //return;
  for ( int i = 0; i < node->children.size(); i++ ) 
    post_orden ( node->children[i] );
  cout << node->value << ", ";
}

void deleteTree ( Node* node ) {
  //`if ( node == nullptr ) 
    //return;
  for ( int i = 0; i < node->children.size(); i++ )
    deleteTree ( node->children[i] );
  delete node;
}

int main () {
  Node* root = new Node ( 'A' );

  addChild ( root, 'B' );
  addChild ( root, 'C' );
  addChild ( root, 'D' );

  addChild ( root->children[0], 'E' );
  addChild ( root->children[0], 'F' );

  addChild ( root->children[0]->children[1], 'J' );
  addChild ( root->children[0]->children[1], 'K' );
  addChild ( root->children[0]->children[1], 'L' );

  addChild ( root->children[2], 'G' );
  addChild ( root->children[2], 'H' );
  addChild ( root->children[2], 'I' );

  addChild ( root->children[2]->children[0], 'M' );
  addChild ( root->children[2]->children[0]->children[0], 'P' );
  addChild ( root->children[2]->children[0]->children[0], 'Q' );

  addChild ( root->children[2]->children[2], 'N' );
  addChild ( root->children[2]->children[2], 'O' );

  pre_orden ( root );
  cout << endl;
  post_orden ( root );
  cout << endl;
  deleteTree ( root );

}
