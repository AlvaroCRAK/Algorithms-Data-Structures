#include <iostream>
using namespace std;

struct Node {
  Node* left;
  Node* right;
  char value;
  Node ( char val ) : value ( val ) { }
};

void traversal_pre_order ( Node* node ) {
  if ( node == nullptr ) return;
  cout << node->value << ", ";
  traversal_pre_order ( node->left );
  traversal_pre_order ( node->right );
}
void traversal_in_order ( Node* node ) {
  if ( node == nullptr ) return;
  traversal_in_order ( node->left );
  cout << node->value << ", ";
  traversal_in_order ( node->right );
}
void traversal_post_order ( Node* node ) {
  if ( node == nullptr ) return;
  traversal_post_order ( node->left );
  traversal_post_order ( node->right );
  cout << node->value << ", ";
}
void deleteTree ( Node* node ) {
  if ( node == nullptr ) return;
  deleteTree ( node->left );
  deleteTree ( node->right );
  delete node;
}
int main () {
  Node* root = new Node ( 'A' );
  root->left = new Node ( 'B' );
  root->right = new Node ( 'C' );
  root->left->left = new Node ( 'D' );
  root->left->right = new Node ( 'E' );
  root->left->right->left = new Node ( 'H' );
  root->left->right->right = new Node ( 'I' );

  root->right->left = new Node ( 'F' );
  root->right->right = new Node ( 'G' );
  root->right->left->left = new Node ( 'J' );
  root->right->left->right = new Node ( 'K' );

  traversal_pre_order ( root ); cout << endl;
  traversal_in_order ( root ); cout << endl;
  traversal_post_order ( root ); cout << endl;
  
  deleteTree ( root );
}
