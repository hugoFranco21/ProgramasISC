class EvalTree {
private:
	TreeNode *root;

	std::queue<std::string> tokenize(std::string);

public:
	EvalTree();
	EvalTree(std::string) throw (IllegalAction);
	~EvalTree();
	bool empty() const;
	int height() const;
	std::string inorder() const;
	std::string postorder() const;
	std::string preorder() const;
	std::string levelOrder() const;
	int howManyLeaves() const;
	char minValue() const throw (IllegalAction);
	bool find(char) const;
	double eval(double) const throw (IllegalAction) ;
	EvalTree* derive() const;
	void removeAll();
	bool isFull() const;
	int internalNodes() const;
	bool isPerfect() const;
	bool isDegenerate() const;
};

EvalTree::EvalTree() {
	root = 0;
}

std::queue<std::string> EvalTree::tokenize(std::string str) {
	int i = 0;
	int length = str.size();
	std::string aux;
	std::queue<std::string> result;

	while (i < length) {
		if (isdigit(str[i])) {
			aux.clear();
			do {
				aux += str[i];
				i++;
			} while(isdigit(str[i]));
			result.push(aux);
		} else if (isspace(str[i])) {
			i++;
		} else {
			aux.clear();
			aux += str[i];
			result.push(aux);
			i++;
		}
	}
	return result;
}

EvalTree::EvalTree(std::string str) throw (IllegalAction) {
	root = 0;
	std::stack<TreeNode*> s;
	std::queue<std::string> tokens = tokenize(str);
	std::string aux;
	TreeNode *left, *right, *newNode;

	while (!tokens.empty()) {
		aux = tokens.front(); tokens.pop();
		if (aux == "+" || aux == "-" || aux == "*" || aux == "/") {
			if (s.empty()) {
				throw IllegalAction();
			}
			left = s.top(); s.pop();
			if (s.empty()) {
				throw IllegalAction();
			}
			right = s.top(); s.pop();
			newNode = new TreeNode(aux[0], left, right);
			s.push(newNode);
		} else if (aux[0] == 'x' || isdigit(aux[0])) {
			newNode = new TreeNode(aux[0]);
			s.push(newNode);
		}
	}
	newNode = s.top(); s.pop();
	if (!s.empty()) {
		throw IllegalAction();
	}
	root = newNode;
}

EvalTree::~EvalTree() {
	removeAll();
}

bool EvalTree::empty() const {
	return (root == 0);
}

int EvalTree::height() const {
	if (empty()) {
		return 0;
	} else  {
		return root->depth() + 1;
	}
}

std::string EvalTree::inorder() const {
	std::stringstream aux;

	if (!empty()) {
		root->inorder(aux);
	}
	return aux.str();
}

std::string EvalTree::preorder() const {
	std::stringstream aux;

	if (!empty()) {
		root->preorder(aux);
	}
	return aux.str();
}

std::string EvalTree::postorder() const {
	std::stringstream aux;

	if (!empty()) {
		root->postorder(aux);
	}
	return aux.str();
}

std::string EvalTree::levelOrder() const {
	std::queue<TreeNode*> q;
	std::stringstream aux;

	if (!empty()) {
		q.push(root);
		while (!q.empty()) {
			TreeNode* node = q.front(); q.pop();
			aux << node->value << " ";
			if (node->left != 0) {
				q.push(node->left);
			}
			if (node->right != 0) {
				q.push(node->right);
			}
		}
	}
	return aux.str();
}

int EvalTree::howManyLeaves() const {
	if (empty()) {
		return 0;
	} else {
		return root->howManyLeaves();
	}
}

char EvalTree::minValue() const throw (IllegalAction) {
	if (empty()) {
		throw IllegalAction();
	} else {
		return root->minValue();
	}
}

bool EvalTree::find(char c) const {
	if (empty()) {
		return false;
	} else {
		return root->find(c);
	}
}

double EvalTree::eval(double x) const throw (IllegalAction) {
	if (empty()) {
		throw IllegalAction();
	} else {
		return root->eval(x);
	}
}

EvalTree* EvalTree::derive() const {
	EvalTree* n;

	n = new EvalTree();
	if (root != 0) {
		n->root = root->derive();
	}
	return n;
}

void EvalTree::removeAll() {

}

bool EvalTree::isFull() const {
	return false;
}

int EvalTree::internalNodes() const {
	return 0;
}

bool EvalTree::isPerfect() const {
	return false;
}

bool EvalTree::isDegenerate() const {
	return false;
}

#endif /* EVALTREE_H_ */
