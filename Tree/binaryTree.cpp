#include <iostream>
using namespace std;

struct Node {
  Node* left;
  Node* right;
  char value;
  Node ( char val ) : value ( val ) {} 
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

int max_height (Node* node ) {
  if ( node == nullptr ) return 0;
  return max ( max_height ( node->left ), max_height ( node->right ) ) + 1;
}

int num_nodes ( Node* node ) {
  if ( node == nullptr ) return 0;
  return 1 + num_nodes ( node->left ) + num_nodes ( node->right );
}

int main () {
  /*
  Node* root = new Node ( 1 );
  root->left = new Node ( 7 );
  root->left->left = new Node ( 2 );
  root->left->right = new Node ( 6 );
  root->left->right->left = new Node ( 5 );
  root->left->right->right = new Node ( 11 );
  root->right = new Node ( 9 );
  root->right->right = new Node ( 9 );
  root->right->right->left = new Node ( 5 );
  */
  Node* root = new Node ( 'E' );
  root->left = new Node ( 'U' );
  root->left->left = new Node ( 'R' );
  root->left->left->left = new Node ( 'M' );
  root->left->left->right = new Node ( 'A' );
  root->left->right = new Node ( 'O' );
  root->left->right->right = new Node ( 'N' );
  root->left->right->right->left = new Node ( 'D' );
  root->left->right->right->left->left = new Node ( 'V' );
  root->left->right->right->left->left->left = new Node ( 'S' );
  root->left->right->right->left->left->left->left = new Node ( 'Z' );
  root->right = new Node ( 'T' );


  traversal_pre_order ( root ); cout << endl;
  traversal_in_order ( root ); cout << endl;
  traversal_post_order ( root ); cout << endl;

  cout << max_height ( root ); cout << endl;
  cout << num_nodes ( root ) << endl;
  deleteTree ( root );
}


